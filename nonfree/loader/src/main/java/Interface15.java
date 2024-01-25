import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!mi")
public interface Interface15 {

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(II)V")
	void method6026();

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(I[I)V")
	void method6027(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(IZI)V")
	void method6028() throws Exception;

	@OriginalMember(owner = "loader!mi", name = "b", descriptor = "(II)V")
	void method6029();

	@OriginalMember(owner = "loader!mi", name = "c", descriptor = "(II)I")
	int method6030();

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(ZLjava/awt/Component;IZ)V")
	void method6031(@OriginalArg(1) Component arg0) throws Exception;
}
