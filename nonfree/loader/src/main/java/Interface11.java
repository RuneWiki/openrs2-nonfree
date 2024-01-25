import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ro")
public interface Interface11 {

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(IB)V")
	void method5774();

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(I[I)V")
	void method5775(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(III)V")
	void method5776() throws Exception;

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(BI)I")
	int method5777();

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(II)V")
	void method5778();

	@OriginalMember(owner = "loader!ro", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5779(@OriginalArg(2) Component arg0) throws Exception;
}
