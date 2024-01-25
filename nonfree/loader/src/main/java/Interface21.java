import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ap")
public interface Interface21 {

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IB)I")
	int method7828();

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
	void method7829(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(I[I)V")
	void method7830(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IZI)V")
	void method7831() throws Exception;

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(II)V")
	void method7832();

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(IB)V")
	void method7833();
}
