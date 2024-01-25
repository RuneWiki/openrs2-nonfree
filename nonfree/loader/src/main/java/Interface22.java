import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!kaa")
public interface Interface22 {

	@OriginalMember(owner = "loader!kaa", name = "a", descriptor = "(I[I)V")
	void method7593(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!kaa", name = "a", descriptor = "(III)V")
	void method7594() throws Exception;

	@OriginalMember(owner = "loader!kaa", name = "a", descriptor = "(BI)V")
	void method7595();

	@OriginalMember(owner = "loader!kaa", name = "a", descriptor = "(II)I")
	int method7596();

	@OriginalMember(owner = "loader!kaa", name = "b", descriptor = "(II)V")
	void method7597();

	@OriginalMember(owner = "loader!kaa", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method7598(@OriginalArg(1) Component arg0) throws Exception;
}
