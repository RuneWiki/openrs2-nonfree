import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ur")
public interface Interface14 {

	@OriginalMember(owner = "loader!ur", name = "a", descriptor = "(I[I)V")
	void method6268(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ur", name = "a", descriptor = "(IB)V")
	void method6269();

	@OriginalMember(owner = "loader!ur", name = "a", descriptor = "(II)I")
	int method6270();

	@OriginalMember(owner = "loader!ur", name = "a", descriptor = "(IIB)V")
	void method6271() throws Exception;

	@OriginalMember(owner = "loader!ur", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
	void method6272(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ur", name = "b", descriptor = "(II)V")
	void method6273();
}
