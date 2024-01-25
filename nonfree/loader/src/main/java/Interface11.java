import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!pl")
public interface Interface11 {

	@OriginalMember(owner = "loader!pl", name = "a", descriptor = "(IZ)V")
	void method5776();

	@OriginalMember(owner = "loader!pl", name = "b", descriptor = "(II)I")
	int method5777();

	@OriginalMember(owner = "loader!pl", name = "a", descriptor = "(IZI)V")
	void method5778() throws Exception;

	@OriginalMember(owner = "loader!pl", name = "a", descriptor = "(II)V")
	void method5779();

	@OriginalMember(owner = "loader!pl", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5780(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!pl", name = "a", descriptor = "(I[I)V")
	void method5781(@OriginalArg(1) int[] arg0);
}
