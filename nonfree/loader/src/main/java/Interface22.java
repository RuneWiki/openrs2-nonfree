import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!pn")
public interface Interface22 {

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(ZLjava/awt/Component;BI)V")
	void method8077(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(BI)I")
	int method8078();

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(IBI)V")
	void method8079() throws Exception;

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(II)V")
	void method8080();

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(I[I)V")
	void method8081(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(IZ)V")
	void method8082();
}
