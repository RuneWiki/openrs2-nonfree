import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!dh")
public interface Interface14 {

	@OriginalMember(owner = "loader!dh", name = "a", descriptor = "(BI)V")
	void method5764();

	@OriginalMember(owner = "loader!dh", name = "a", descriptor = "(ZI)V")
	void method5765();

	@OriginalMember(owner = "loader!dh", name = "a", descriptor = "(IIZ)V")
	void method5766() throws Exception;

	@OriginalMember(owner = "loader!dh", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5767(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!dh", name = "a", descriptor = "(I[I)V")
	void method5768(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!dh", name = "b", descriptor = "(ZI)I")
	int method5769();
}
