import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!eu")
public interface Interface14 {

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(III)V")
	void method6083() throws Exception;

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(IB)V")
	void method6084();

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(ZI)I")
	int method6085();

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
	void method6086(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(I[I)V")
	void method6087(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(II)V")
	void method6088();
}
