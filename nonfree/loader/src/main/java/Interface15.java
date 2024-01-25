import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!nc")
public interface Interface15 {

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
	void method6324(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(BII)V")
	void method6325() throws Exception;

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(BI)V")
	void method6326();

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(IZ)I")
	int method6327();

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(II)V")
	void method6328();

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(I[I)V")
	void method6329(@OriginalArg(1) int[] arg0);
}
