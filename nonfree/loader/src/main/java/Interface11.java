import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!jq")
public interface Interface11 {

	@OriginalMember(owner = "loader!jq", name = "a", descriptor = "(II)V")
	void method5756();

	@OriginalMember(owner = "loader!jq", name = "b", descriptor = "(BI)I")
	int method5757();

	@OriginalMember(owner = "loader!jq", name = "a", descriptor = "(III)V")
	void method5758() throws Exception;

	@OriginalMember(owner = "loader!jq", name = "a", descriptor = "(BI)V")
	void method5759();

	@OriginalMember(owner = "loader!jq", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5760(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!jq", name = "a", descriptor = "(I[I)V")
	void method5761(@OriginalArg(1) int[] arg0);
}
