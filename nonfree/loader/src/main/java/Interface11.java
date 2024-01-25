import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!sb")
public interface Interface11 {

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(II)V")
	void method5768();

	@OriginalMember(owner = "loader!sb", name = "c", descriptor = "(II)I")
	int method5769();

	@OriginalMember(owner = "loader!sb", name = "b", descriptor = "(II)V")
	void method5770();

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5771(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(I[I)V")
	void method5772(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(ZII)V")
	void method5773() throws Exception;
}
