import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!rj")
public interface Interface13 {

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(ZI)I")
	int method5817();

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method5818(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(IIZ)V")
	void method5819() throws Exception;

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(I[I)V")
	void method5820(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(II)V")
	void method5821();

	@OriginalMember(owner = "loader!rj", name = "b", descriptor = "(II)V")
	void method5822();
}
