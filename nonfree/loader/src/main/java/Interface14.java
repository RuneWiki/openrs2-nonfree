import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!fa")
public interface Interface14 {

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(II)V")
	void method6036();

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(IB)I")
	int method6037();

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(BI)V")
	void method6038();

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(IIB)V")
	void method6039() throws Exception;

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(I[I)V")
	void method6040(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method6041(@OriginalArg(2) Component arg0) throws Exception;
}
