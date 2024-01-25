import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!hba")
public interface Interface22 {

	@OriginalMember(owner = "loader!hba", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method8009(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!hba", name = "a", descriptor = "(I[I)V")
	void method8010(@OriginalArg(1) int[] arg0);

	@OriginalMember(owner = "loader!hba", name = "a", descriptor = "(ZI)I")
	int method8011();

	@OriginalMember(owner = "loader!hba", name = "b", descriptor = "(II)V")
	void method8012();

	@OriginalMember(owner = "loader!hba", name = "a", descriptor = "(III)V")
	void method8013() throws Exception;

	@OriginalMember(owner = "loader!hba", name = "a", descriptor = "(II)V")
	void method8014();
}
