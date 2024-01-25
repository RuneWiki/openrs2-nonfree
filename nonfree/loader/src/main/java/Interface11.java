import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!pg")
public interface Interface11 {

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(I[I)V")
	void method5859(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(ZI)V")
	void method5860();

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(III)V")
	void method5861() throws Exception;

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(II)I")
	int method5862();

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
	void method5863(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!pg", name = "a", descriptor = "(BI)V")
	void method5864();
}
