import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!uh")
public interface Interface11 {

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(IIB)V")
	void method5802() throws Exception;

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(ZIZLjava/awt/Component;)V")
	void method5803(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(II)V")
	void method5804();

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(I[I)V")
	void method5805(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(BI)V")
	void method5806();

	@OriginalMember(owner = "loader!uh", name = "a", descriptor = "(ZI)I")
	int method5807();
}
