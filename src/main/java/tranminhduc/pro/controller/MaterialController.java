package tranminhduc.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import tranminhduc.pro.model.Material;
import tranminhduc.pro.model.Supplier;
import tranminhduc.pro.service.MaterialService;
import tranminhduc.pro.service.SupplierService;

@Controller
public class MaterialController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private MaterialService materialService;
    @GetMapping("/testconfig")
    public String testConfig(){
        return "test";
    }
    @GetMapping("/create-material")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("material/create");
        modelAndView.addObject("material", new Material());
        return modelAndView;
    }
    @PostMapping("/create-material")
    public ModelAndView saveMaterial(@ModelAttribute("material") Material material){
        materialService.save(material);
        ModelAndView modelAndView = new ModelAndView("material/create");
        modelAndView.addObject("material", new Material());
        modelAndView.addObject("message", "Material has been created");
        return modelAndView;

    }
    @GetMapping("/materials")
    public ModelAndView listMaterials(@PageableDefault(size = 5) Pageable pageable){
        Page<Material> materials = materialService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("material/list");
        modelAndView.addObject("materials", materials);
        return modelAndView;
    }
    @GetMapping("/edit-material/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Material material = materialService.findById(id);
        if(material != null){
            ModelAndView modelAndView = new ModelAndView("material/edit");
            modelAndView.addObject("material", material);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }
    }
    @PostMapping("/edit-material")
    public ModelAndView updateMaterial(@ModelAttribute("material") Material material){
        materialService.save(material);
        ModelAndView modelAndView = new ModelAndView("material/edit");
        modelAndView.addObject("material", material);
        modelAndView.addObject("message", "Material has been updated");
        return modelAndView;
    }
    @GetMapping("/delete-material/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Material material = materialService.findById(id);
        if(material != null){
            ModelAndView modelAndView = new ModelAndView("material/delete");
            modelAndView.addObject("material", material);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }

    }
    @PostMapping("/delete-material")
    public String deleteMaterial(@ModelAttribute("material") Material material){
        materialService.remove(material.getId());
        return "redirect:materials";
    }
    @ModelAttribute("suppliers")
    public Iterable<Supplier> suppliers(){
        return supplierService.findAll();
    }
}
