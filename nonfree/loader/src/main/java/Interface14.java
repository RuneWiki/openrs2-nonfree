import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ed")
public interface Interface14 {

	@OriginalMember(owner = "loader!ed", name = "b", descriptor = "(II)I")
	int method6114();

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(I[I)V")
	void method6115(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(IZ)V")
	void method6116();

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
	void method6117(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(BII)V")
	void method6118() throws Exception;

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(II)V")
	void method6119();
}
