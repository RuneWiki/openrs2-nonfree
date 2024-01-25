import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!qg")
public interface Interface13 {

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "(II)I")
	int method5802();

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "(I[I)V")
	void method5803(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method5804(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!qg", name = "b", descriptor = "(II)V")
	void method5805();

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "(BII)V")
	void method5806() throws Exception;

	@OriginalMember(owner = "loader!qg", name = "c", descriptor = "(II)V")
	void method5807();
}
