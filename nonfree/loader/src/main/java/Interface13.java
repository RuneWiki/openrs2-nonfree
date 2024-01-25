import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!bn")
public interface Interface13 {

	@OriginalMember(owner = "loader!bn", name = "a", descriptor = "(IB)I")
	int method6139();

	@OriginalMember(owner = "loader!bn", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
	void method6140(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!bn", name = "a", descriptor = "(II)V")
	void method6141();

	@OriginalMember(owner = "loader!bn", name = "a", descriptor = "(I[I)V")
	void method6142(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!bn", name = "b", descriptor = "(II)V")
	void method6143();

	@OriginalMember(owner = "loader!bn", name = "a", descriptor = "(III)V")
	void method6144() throws Exception;
}
