import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ch")
public interface Interface21 {

	@OriginalMember(owner = "loader!ch", name = "a", descriptor = "(IBI)V")
	void method8278() throws Exception;

	@OriginalMember(owner = "loader!ch", name = "a", descriptor = "(I[I)V")
	void method8279(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ch", name = "a", descriptor = "(BI)V")
	void method8280();

	@OriginalMember(owner = "loader!ch", name = "a", descriptor = "(ZILjava/awt/Component;Z)V")
	void method8281(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ch", name = "b", descriptor = "(II)I")
	int method8282();

	@OriginalMember(owner = "loader!ch", name = "a", descriptor = "(II)V")
	void method8283();
}
