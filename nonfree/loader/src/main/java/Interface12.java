import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!fc")
public interface Interface12 {

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(IB)V")
	void method6507();

	@OriginalMember(owner = "loader!fc", name = "b", descriptor = "(II)V")
	void method6508();

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(IBI)V")
	void method6509() throws Exception;

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(I[I)V")
	void method6510(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method6511(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(II)I")
	int method6512();
}
