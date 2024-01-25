import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!mt")
public interface Interface15 {

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(II)I")
	int method6373();

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(I[I)V")
	void method6374(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(III)V")
	void method6375() throws Exception;

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
	void method6376(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(IB)V")
	void method6377();

	@OriginalMember(owner = "loader!mt", name = "a", descriptor = "(BI)V")
	void method6378();
}
