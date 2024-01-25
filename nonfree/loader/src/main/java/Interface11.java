import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!mf")
public interface Interface11 {

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	void method6031(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(II)V")
	void method6032();

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(IB)I")
	int method6033();

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(IIB)V")
	void method6034() throws Exception;

	@OriginalMember(owner = "loader!mf", name = "b", descriptor = "(II)V")
	void method6035();

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(I[I)V")
	void method6036(@OriginalArg(1) int[] arg0);
}
