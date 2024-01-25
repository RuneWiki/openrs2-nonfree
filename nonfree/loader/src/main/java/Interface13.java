import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!cq")
public interface Interface13 {

	@OriginalMember(owner = "loader!cq", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method6107(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!cq", name = "b", descriptor = "(IB)I")
	int method6108();

	@OriginalMember(owner = "loader!cq", name = "a", descriptor = "(IB)V")
	void method6109();

	@OriginalMember(owner = "loader!cq", name = "a", descriptor = "(I[I)V")
	void method6110(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!cq", name = "a", descriptor = "(II)V")
	void method6111();

	@OriginalMember(owner = "loader!cq", name = "a", descriptor = "(IIB)V")
	void method6112() throws Exception;
}
