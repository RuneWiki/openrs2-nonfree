import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!pu")
public interface Interface14 {

	@OriginalMember(owner = "loader!pu", name = "a", descriptor = "(I[I)V")
	void method6161(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!pu", name = "a", descriptor = "(IIZ)V")
	void method6162() throws Exception;

	@OriginalMember(owner = "loader!pu", name = "a", descriptor = "(BI)I")
	int method6163();

	@OriginalMember(owner = "loader!pu", name = "b", descriptor = "(II)V")
	void method6164();

	@OriginalMember(owner = "loader!pu", name = "a", descriptor = "(II)V")
	void method6165();

	@OriginalMember(owner = "loader!pu", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	void method6166(@OriginalArg(1) Component arg0) throws Exception;
}
