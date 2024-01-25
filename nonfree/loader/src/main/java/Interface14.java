import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ol")
public interface Interface14 {

	@OriginalMember(owner = "loader!ol", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method6060(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ol", name = "a", descriptor = "(I[I)V")
	void method6061(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ol", name = "c", descriptor = "(II)V")
	void method6062();

	@OriginalMember(owner = "loader!ol", name = "b", descriptor = "(II)I")
	int method6063();

	@OriginalMember(owner = "loader!ol", name = "a", descriptor = "(III)V")
	void method6064() throws Exception;

	@OriginalMember(owner = "loader!ol", name = "a", descriptor = "(II)V")
	void method6065();
}
