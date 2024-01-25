import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!kl")
public interface Interface11 {

	@OriginalMember(owner = "loader!kl", name = "c", descriptor = "(II)V")
	void method6082();

	@OriginalMember(owner = "loader!kl", name = "b", descriptor = "(II)V")
	void method6083();

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method6084(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "(II)I")
	int method6085();

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "(I[I)V")
	void method6086(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "(ZII)V")
	void method6087() throws Exception;
}
