import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!hp")
public interface Interface14 {

	@OriginalMember(owner = "loader!hp", name = "a", descriptor = "(I[I)V")
	void method5923(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!hp", name = "a", descriptor = "(II)I")
	int method5924();

	@OriginalMember(owner = "loader!hp", name = "a", descriptor = "(BII)V")
	void method5925() throws Exception;

	@OriginalMember(owner = "loader!hp", name = "a", descriptor = "(IZ)V")
	void method5926();

	@OriginalMember(owner = "loader!hp", name = "b", descriptor = "(II)V")
	void method5927();

	@OriginalMember(owner = "loader!hp", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method5928(@OriginalArg(0) Component arg0) throws Exception;
}
