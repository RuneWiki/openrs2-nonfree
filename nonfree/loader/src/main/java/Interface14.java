import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!gq")
public interface Interface14 {

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method5900(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(BI)V")
	void method5901();

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(IIB)V")
	void method5902() throws Exception;

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(I[I)V")
	void method5903(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!gq", name = "b", descriptor = "(II)I")
	int method5904();

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(II)V")
	void method5905();
}
