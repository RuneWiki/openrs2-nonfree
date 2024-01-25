import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ql")
public interface Interface14 {

	@OriginalMember(owner = "loader!ql", name = "a", descriptor = "(I[I)V")
	void method6069(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ql", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
	void method6070(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ql", name = "a", descriptor = "(IB)I")
	int method6071();

	@OriginalMember(owner = "loader!ql", name = "a", descriptor = "(II)V")
	void method6072();

	@OriginalMember(owner = "loader!ql", name = "a", descriptor = "(BII)V")
	void method6073() throws Exception;

	@OriginalMember(owner = "loader!ql", name = "b", descriptor = "(IB)V")
	void method6074();
}
