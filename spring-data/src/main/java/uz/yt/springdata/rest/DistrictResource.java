package uz.yt.springdata.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.yt.springdata.DTO.DistrictDTO;
import uz.yt.springdata.DTO.RegionDTO;
import uz.yt.springdata.DTO.ResponseDTO;
import uz.yt.springdata.service.DistrictService;
import uz.yt.springdata.service.RegionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("district")
public class DistrictResource {
    private final DistrictService districtService;
    //sout all info in region
    @GetMapping("getall")
    public ResponseDTO<List<DistrictDTO>> getAll()
    {
        return districtService.findall();
    }


    //sout region by id
    @GetMapping("getbyid")
    public ResponseDTO<DistrictDTO>getAll(@RequestParam Integer id) {return districtService.findbyid(id);}

    //add info in region
    @PostMapping("add")
    public ResponseDTO<DistrictDTO> add(@RequestBody DistrictDTO districtDTO) {return districtService.addnew(districtDTO);}
    //update info region
    @PutMapping ("update")
    public ResponseDTO<DistrictDTO> update(@RequestBody DistrictDTO districtDTO) {return districtService.update(districtDTO);}

}
