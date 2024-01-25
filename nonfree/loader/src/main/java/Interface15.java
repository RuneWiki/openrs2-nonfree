import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!pv")
public interface Interface15 {

	@OriginalMember(owner = "loader!pv", name = "b", descriptor = "(II)V")
	void method6390();

	@OriginalMember(owner = "loader!pv", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
	void method6391(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!pv", name = "a", descriptor = "(III)V")
	void method6392() throws Exception;

	@OriginalMember(owner = "loader!pv", name = "a", descriptor = "(I[I)V")
	void method6393(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!pv", name = "a", descriptor = "(II)V")
	void method6394();

	@OriginalMember(owner = "loader!pv", name = "a", descriptor = "(BI)I")
	int method6395();
}
