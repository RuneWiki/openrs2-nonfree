import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!la")
public interface Interface11 {

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(I[I)V")
	void method5801(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(II)I")
	int method5802();

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(III)V")
	void method5803() throws Exception;

	@OriginalMember(owner = "loader!la", name = "b", descriptor = "(II)V")
	void method5804();

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(IZ)V")
	void method5805();

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method5806(@OriginalArg(0) Component arg0) throws Exception;
}
