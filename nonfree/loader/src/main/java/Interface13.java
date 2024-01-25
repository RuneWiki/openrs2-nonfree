import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!af")
public interface Interface13 {

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method5646(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(II)I")
	int method5647();

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(BI)V")
	void method5648();

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(I[I)V")
	void method5649(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(III)V")
	void method5650() throws Exception;

	@OriginalMember(owner = "loader!af", name = "b", descriptor = "(II)V")
	void method5651();
}
