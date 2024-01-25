import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ci")
public interface Interface11 {

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(I[I)V")
	void method5879(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(II)V")
	void method5880();

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(II)V")
	void method5881();

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(III)V")
	void method5882() throws Exception;

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method5883(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(BI)I")
	int method5884();
}
