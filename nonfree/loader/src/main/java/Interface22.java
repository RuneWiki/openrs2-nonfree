import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!tba")
public interface Interface22 {

	@OriginalMember(owner = "loader!tba", name = "b", descriptor = "(II)I")
	int method7518();

	@OriginalMember(owner = "loader!tba", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method7519(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!tba", name = "a", descriptor = "(II)V")
	void method7520();

	@OriginalMember(owner = "loader!tba", name = "a", descriptor = "(I[I)V")
	void method7521(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!tba", name = "a", descriptor = "(IZ)V")
	void method7522();

	@OriginalMember(owner = "loader!tba", name = "a", descriptor = "(III)V")
	void method7523() throws Exception;
}
