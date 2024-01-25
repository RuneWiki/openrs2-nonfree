import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!kc")
public interface Interface12 {

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(IBI)V")
	void method6135() throws Exception;

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(BI)I")
	int method6136();

	@OriginalMember(owner = "loader!kc", name = "b", descriptor = "(BI)V")
	void method6137();

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(I[I)V")
	void method6138(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(IB)V")
	void method6139();

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	void method6140(@OriginalArg(2) Component arg0) throws Exception;
}
