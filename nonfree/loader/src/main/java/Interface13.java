import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!cd")
public interface Interface13 {

	@OriginalMember(owner = "loader!cd", name = "a", descriptor = "(III)V")
	void method6613() throws Exception;

	@OriginalMember(owner = "loader!cd", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method6614(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!cd", name = "a", descriptor = "(IB)I")
	int method6615();

	@OriginalMember(owner = "loader!cd", name = "b", descriptor = "(IB)V")
	void method6616();

	@OriginalMember(owner = "loader!cd", name = "a", descriptor = "(I[I)V")
	void method6617(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!cd", name = "a", descriptor = "(ZI)V")
	void method6618();
}
