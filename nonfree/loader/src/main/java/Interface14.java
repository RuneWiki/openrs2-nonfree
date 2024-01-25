import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!in")
public interface Interface14 {

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(BII)V")
	void method5855() throws Exception;

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
	void method5856(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!in", name = "b", descriptor = "(II)V")
	void method5857();

	@OriginalMember(owner = "loader!in", name = "c", descriptor = "(II)V")
	void method5858();

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(I[I)V")
	void method5859(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(II)I")
	int method5860();
}
