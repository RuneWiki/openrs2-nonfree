import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!uf")
public interface Interface13 {

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(III)V")
	void method5734() throws Exception;

	@OriginalMember(owner = "loader!uf", name = "b", descriptor = "(IZ)V")
	void method5735();

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method5736(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(I[I)V")
	void method5737(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(IZ)I")
	int method5738();

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(II)V")
	void method5739();
}
