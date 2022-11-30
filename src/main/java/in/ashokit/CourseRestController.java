package in.ashokit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController
{
	@GetMapping("/course/{name}")
	public ResponseEntity<String> courseDtls(@PathVariable String name)
	{
		String msg = null;
		if("SBMS".equals(name))
		{
			msg=name+" >> It will be starting soon";
		}
		else if("JAVA".equals(name))
		{
			msg=name+" >> It will be starting soon";
		}
		else
		{
			msg=name+" >>Contact IT person";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/course/{name}/{mode}")
	public ResponseEntity<String> courseInfo(@PathVariable String name,@PathVariable String mode)
	{
		String msg = null;
		if("SBMS".equals(name) && "Online".equals(mode))
		{
			msg=name+ ">"+mode+" >>will be stating soon";
		}
		else if("SBMS".equals(name) && "Offline".equals(mode))
		{
			msg=name+ ">"+mode+" >>will be stating soon";
		}
		
		else if("JAVA".equals(name) && "Online".equals(mode))
		{
			msg=name+ ">"+mode+" >>will be stating soon";
		}
		else if("JAVA".equals(name) && "Offline".equals(mode))
		{
			msg=name+ ">"+mode+" >>will be stating soon";
		}
		else
		{
			msg=name+">"+mode+" >contact IT person";
		}
		

		return new ResponseEntity<String>(msg,HttpStatus.OK);

	}

}
