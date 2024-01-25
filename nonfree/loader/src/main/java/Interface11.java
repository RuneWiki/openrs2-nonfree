import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ie")
public interface Interface11 {

	@OriginalMember(owner = "loader!ie", name = "b", descriptor = "(II)I")
	int method5888();

	@OriginalMember(owner = "loader!ie", name = "a", descriptor = "(I[I)V")
	void method5889(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ie", name = "a", descriptor = "(IBI)V")
	void method5890() throws Exception;

	@OriginalMember(owner = "loader!ie", name = "a", descriptor = "(II)V")
	void method5891();

	@OriginalMember(owner = "loader!ie", name = "a", descriptor = "(IB)V")
	void method5892();

	@OriginalMember(owner = "loader!ie", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method5893(@OriginalArg(1) Component arg0) throws Exception;
}
