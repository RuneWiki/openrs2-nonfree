import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!ik")
public interface Interface15 {

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method6123(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(III)V")
	void method6124() throws Exception;

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(I[I)V")
	void method6125(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(IB)V")
	void method6126();

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(II)I")
	int method6127();

	@OriginalMember(owner = "loader!ik", name = "a", descriptor = "(BI)V")
	void method6128();
}
