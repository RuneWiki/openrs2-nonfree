import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!td")
public interface Interface13 {

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method6049(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(IB)V")
	void method6050();

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(IIB)V")
	void method6051() throws Exception;

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(BI)I")
	int method6052();

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(II)V")
	void method6053();

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(I[I)V")
	void method6054(@OriginalArg(1) int[] arg0);
}
