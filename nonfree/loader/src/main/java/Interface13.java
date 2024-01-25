import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!rb")
public interface Interface13 {

	@OriginalMember(owner = "loader!rb", name = "a", descriptor = "(I[I)V")
	void method5645(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!rb", name = "a", descriptor = "(III)V")
	void method5646() throws Exception;

	@OriginalMember(owner = "loader!rb", name = "a", descriptor = "(BI)V")
	void method5647();

	@OriginalMember(owner = "loader!rb", name = "b", descriptor = "(II)V")
	void method5648();

	@OriginalMember(owner = "loader!rb", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
	void method5649(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!rb", name = "a", descriptor = "(II)I")
	int method5650();
}
