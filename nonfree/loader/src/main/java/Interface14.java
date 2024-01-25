import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!gm")
public interface Interface14 {

	@OriginalMember(owner = "loader!gm", name = "a", descriptor = "(II)V")
	void method6089();

	@OriginalMember(owner = "loader!gm", name = "a", descriptor = "(III)V")
	void method6090() throws Exception;

	@OriginalMember(owner = "loader!gm", name = "b", descriptor = "(II)I")
	int method6091();

	@OriginalMember(owner = "loader!gm", name = "c", descriptor = "(II)V")
	void method6092();

	@OriginalMember(owner = "loader!gm", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method6093(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!gm", name = "a", descriptor = "(I[I)V")
	void method6094(@OriginalArg(1) int[] arg0);
}
