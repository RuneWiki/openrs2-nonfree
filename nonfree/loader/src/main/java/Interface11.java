import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!fq")
public interface Interface11 {

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(IBI)V")
	void method5703() throws Exception;

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(I[I)V")
	void method5704(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(II)V")
	void method5705();

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(BI)V")
	void method5706();

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(II)I")
	int method5707();

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method5708(@OriginalArg(0) Component arg0) throws Exception;
}
