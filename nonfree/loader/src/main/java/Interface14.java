import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!qn")
public interface Interface14 {

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/awt/Component;ZZI)V")
	void method5740(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!qn", name = "c", descriptor = "(II)I")
	int method5741();

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(BII)V")
	void method5742() throws Exception;

	@OriginalMember(owner = "loader!qn", name = "b", descriptor = "(II)V")
	void method5743();

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(I[I)V")
	void method5744(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(II)V")
	void method5745();
}
