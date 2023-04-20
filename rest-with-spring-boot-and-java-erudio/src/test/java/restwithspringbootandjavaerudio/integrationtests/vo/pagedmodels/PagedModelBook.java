package restwithspringbootandjavaerudio.integrationtests.vo.pagedmodels;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import restwithspringbootandjavaerudio.integrationtests.vo.BookVO;
import restwithspringbootandjavaerudio.integrationtests.vo.PersonVO;

@XmlRootElement
public class PagedModelBook {

	@XmlElement(name = "content")
	private List<BookVO> content;

	public PagedModelBook() {}

	public List<BookVO> getContent() {
		return content;
	}

	public void setContent(List<BookVO> content) {
		this.content = content;
	}
}