

trait Cache[K, V]{
  def get(key: K): V
  def pug(key: K, value: V)
  def delete(key: K)

}
