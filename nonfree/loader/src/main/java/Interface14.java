import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ee")
public interface Interface14 {

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(I[I)V")
	void method5983(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(BII)V")
	void method5984() throws Exception;

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(II)V")
	void method5985();

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(BI)I")
	int method5986();

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method5987(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(IB)V")
	void method5988();
}
