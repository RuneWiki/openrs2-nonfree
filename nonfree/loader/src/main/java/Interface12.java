import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ea")
public interface Interface12 {

	@OriginalMember(owner = "loader!ea", name = "b", descriptor = "(II)V")
	void method5905();

	@OriginalMember(owner = "loader!ea", name = "a", descriptor = "(BI)V")
	void method5906();

	@OriginalMember(owner = "loader!ea", name = "a", descriptor = "(III)V")
	void method5907() throws Exception;

	@OriginalMember(owner = "loader!ea", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
	void method5908(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ea", name = "a", descriptor = "(I[I)V")
	void method5909(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ea", name = "a", descriptor = "(II)I")
	int method5910();
}
