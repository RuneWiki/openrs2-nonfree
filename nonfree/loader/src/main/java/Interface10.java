import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public interface Interface10 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I[I)V")
	void method6010(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	void method6011() throws Exception;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IZBLjava/awt/Component;)V")
	void method6012(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BI)I")
	int method6013();

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(II)V")
	void method6014();

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "(II)V")
	void method6015();
}
